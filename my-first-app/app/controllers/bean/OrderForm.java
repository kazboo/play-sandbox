package controllers.bean;

import play.mvc.Http.Request;

public class OrderForm {

    private String _orderType;

    private String _userId;

    private String _userName;

    private OrderForm(Request request) {
        setOrderType(request.getQueryString("orderType"));
        setUserId(request.getQueryString("userId"));
        setUserName(request.getQueryString("userName"));
    }

    public OrderForm() {

    }

    public static OrderForm newInstance(Request request) {
        return new OrderForm(request);
    }

    public String getOrderType() {
        return _orderType;
    }

    public void setOrderType(String orderType) {
        _orderType = orderType;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public String getUserId() {
        return _userId;
    }

    public void setUserId(String userId) {
        _userId = userId;
    }
}
