
package web;

import api.*;

import api.facades.TemplateFacade;
import exceptions.*;
import web.commands.Redirect;
import web.commands.UnknownCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public abstract class ICommand {

    /**
     * Whenever you want to make a post or get from a .jsp site, give an input called (name=target).
     * The value of that target you should make a string, like the example with redirect.
     */

    private static HashMap<String, ICommand> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("redirect", new Redirect());
    }

    static ICommand from(HttpServletRequest request ) {
        String targetName = request.getParameter( "target" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(targetName, new UnknownCommand() );   // unknowncommand er default.
    }

    //Creates the api, with this you will be able to just call api.get().YOURMETHOD()
    protected static final Template api;

    static {
        api = createTemplate();
    }

    private static Template createTemplate(){
        return new Template(TemplateFacade.getInstance());
    }

    protected abstract String execute(HttpServletRequest request, HttpServletResponse response);

}
