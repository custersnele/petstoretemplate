package be.pxl.petstore.servlet;

import be.pxl.petstore.rest.data.OrderDTO;

import java.io.PrintWriter;

public class OrderServlet {

	private void writerOrderDTO(PrintWriter writer, OrderDTO order) {
		writer.println("<hr/>");
		writer.println("<div class=\"row\">");
		writer.println(order.getFullname());
		writer.println("</div>");
		for (String orderLine : order.getLineDetails()) {
			writer.println("<div class=\"row\">");
			writer.println(orderLine);
			writer.println("</div>");
		}
		writer.println("<div class=\"row\">Total:");
		writer.println(order.getTotalPrice());
		writer.println("</div>");
	}

	private void writeHeader(PrintWriter writer) {
		writer.println("<html><head><title>Orders</title></head><body>");
	}


	private void writeFooter(PrintWriter writer) {
		writer.println("</body></html>");
	}

}
