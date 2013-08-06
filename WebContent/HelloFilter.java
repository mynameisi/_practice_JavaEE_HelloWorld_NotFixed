package edu.unsw.comp9321;

import java.io.IOException;
import java.util.Random;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class HelloFilter
 */
public class HelloFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HelloFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String greeting = "Oi";
		Random rand = new Random();
		int country = rand.nextInt(7);
		switch(country){
		case 0: greeting = "Howdy"; break;
		case 1: greeting = "Namaste"; break;
		case 2: greeting = "Ni hao"; break;
		case 3: greeting = "G'day"; break;
		case 4: greeting = "Salaam"; break;
		case 5: greeting = "Salut"; break;
		case 6: greeting = "Hej"; break;
		default: greeting = "Yo!"; break;
		}
		request.setAttribute("greeting", greeting);
		System.out.println("Filter invoked "+greeting);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
