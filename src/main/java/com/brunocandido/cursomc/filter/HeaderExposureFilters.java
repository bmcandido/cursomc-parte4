package com.brunocandido.cursomc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

//Esta classe é responsavel por devolver o endereço que o o backend devolve ex: http://localhost:8580/categorias/1
// este endereço o frontEnd não consegue enchergar sem esta classe


	@Component
	public class HeaderExposureFilters implements Filter {



		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {

			HttpServletResponse res = (HttpServletResponse) response;
			res.addHeader("access-control-expose-headers", "location");
			chain.doFilter(request, response);
		}



}
