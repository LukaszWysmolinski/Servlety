package pl.sdacademy.userdb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    private UserRepository userRepository;

    public UserServlet() {
        userRepository = UserRepositoryFactory.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("users", userRepository.getUsers()); //"users" to atrybut wykorzystany w
        // showUsers.jsp w miejscu gdzie wyswietlamy dane uzytkownikow
        req.getRequestDispatcher("showUsers.jsp").forward(req, resp);

    }
}
