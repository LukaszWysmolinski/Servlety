package pl.sdacademy.userdb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    private UserRepository userRepository;

    public RegisterServlet() {
        this.userRepository = UserRepositoryFactory.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("registerUser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("login"),
                req.getParameter("password"),
                req.getParameter("name"),
                req.getParameter("lastName"),
                req.getParameter("phoneNumber"));
        try {
            UserValidator.validate(user, req.getParameter("confirmPassword"));
            userRepository.save(user);
            resp.sendRedirect("showUsers"); //tu zwraca status z header alocation a to ze widzimy
            // strone to serwer prosi o przekierowanie do endpointu showUsers i robi get na
            // header alocation
        } catch (UserValidationException e) {
            resp.sendRedirect("registerUser?hasErrors=true");
        }
    }
}
