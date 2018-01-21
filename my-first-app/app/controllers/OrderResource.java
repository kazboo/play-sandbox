package controllers;

import controllers.bean.OrderForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.order;

public class OrderResource extends Controller {

    public Result getOrder() {

        OrderForm orderForm = new OrderForm();
        orderForm.setType("Research");

        Form<OrderForm> form = Form.form(OrderForm.class)
                .fill(orderForm);

        return ok(order.render("accept GET /orders", form));
    }
}
