package web;

import exceptions.WebException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws WebException {

        String destination = request.getParameter("destination");

        switch (destination){

            case "index":
                break;
            default:
                request.setAttribute("error", "This site does not exist");
                destination = "errorpage";
                break;
        }

        return destination;
    }
}
