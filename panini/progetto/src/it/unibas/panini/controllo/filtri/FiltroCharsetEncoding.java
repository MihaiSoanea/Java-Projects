package it.unibas.panini.controllo.filtri;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FiltroCharsetEncoding implements Filter {

    private String encoding;

    /* (non-Javadoc)
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
            FilterChain filterChain) throws IOException, ServletException {

        //System.out.println("*** Start CharsetEncodingFilter");
        servletRequest.setCharacterEncoding(encoding);
//        servletRequest.setCharacterEncoding("ISO-8859-1");
        servletResponse.setContentType("text/html; charset=UTF-8");
        //System.out.println("*** End CharsetEncodingFilter");

        filterChain.doFilter(servletRequest, servletResponse);
    }

    /* (non-Javadoc)
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig config) throws ServletException {

        encoding = config.getInitParameter("requestEncoding");

        if (encoding == null) {
            encoding = "UTF-8";
        }

    }
}