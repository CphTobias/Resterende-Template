package web.commands;

import exceptions.WebException;
import web.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UnknownCommand extends ICommand {
    @Override
    protected String execute(HttpServletRequest request, HttpServletResponse response) throws WebException {
        String message = "Unknown command!";
        request.setAttribute("error", message);
        return "errorpage";
    }
}
