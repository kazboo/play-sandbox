package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controllers.bean.OrderForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.order;

public class OrderResource extends Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderResource.class);

    public Result getOrder() {
        LOGGER.info("accept GET /orders");

        Form<OrderForm> orderForm = Form.form(OrderForm.class)
                .fill(OrderForm.newInstance(request()));

        LOGGER.info("200 OK");

        return ok(order.render("accept GET /orders", orderForm));
    }
}
