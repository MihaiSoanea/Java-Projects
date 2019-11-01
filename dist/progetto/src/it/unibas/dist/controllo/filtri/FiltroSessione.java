package it.unibas.dist.controllo.filtri;

import it.unibas.dist.modello.Modello;
import it.unibas.dist.modello.Modello;
import it.unibas.dist.modello.Utente;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FiltroSessione implements Filter {

    private static Log logger = LogFactory.getLog(FiltroSessione.class);

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        disableCaching(httpResponse);

        String contextPath = httpRequest.getContextPath();
        String servletPath = httpRequest.getServletPath();
        if (!servletPath.contains("/operatore/") && !servletPath.contains("/admin/")) {
            chain.doFilter(request, response);
            return;
        }
        HttpSession session = httpRequest.getSession();
        Modello modelloLogin = (Modello) session.getAttribute("modello");
        if (modelloLogin == null) {
            schermoErrore(request, response);
            return;
        }
        Utente utente = modelloLogin.getUtente();
        if (utente == null) {
            schermoErrore(request, response);
            return;
        }
        if (servletPath.contains("/operatore/")) {
            if (!utente.getRuolo().equals("operatore")) {
                schermoErrore(request, response);
                return;
            }
        }
        chain.doFilter(request, response);
    }

    private void schermoErrore(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String contextPath = httpRequest.getContextPath();
        String servletPath = httpRequest.getServletPath();
        HttpSession session = httpRequest.getSession();
        ServletContext application = session.getServletContext();
        application.log("FiltroSessione: Sto filtrando la richiesta a " + contextPath + " - " + servletPath);
        RequestDispatcher dispatcher = application.getRequestDispatcher("/schermoErrore.jsf");
        dispatcher.forward(request, response);
    }

    private void disableCaching(HttpServletResponse response) {
        response.addHeader("Pragma", "no-cache");
        response.addHeader("Cache-Control", "no-cache");
        // Stronger according to blog comment below that references HTTP spec
        response.addHeader("Cache-Control", "no-store");
        response.addHeader("Cache-Control", "must-revalidate");
        // some date in the past
        response.addHeader("Expires", "Mon, 8 Aug 2006 10:00:00 GMT");
    }
}
