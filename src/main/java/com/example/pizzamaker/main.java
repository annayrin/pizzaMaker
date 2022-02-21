package com.example.pizzamaker;

import com.example.pizzamaker.repository.OrderRepository;
import com.google.gson.Gson;


public class main {

    public static void main(String[] args) {
//        Connection connection = SQLConnector.getConnection();
//        try{
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into `table` values (0,1,1,true)");
//            int count = preparedStatement.executeUpdate();
//        }catch(SQLException exception){
//           exception.printStackTrace();
//        }
        OrderRepository orderRepository = new OrderRepository();
        Gson gson = new Gson();
        System.out.print(gson.toJson(orderRepository.readAll()));

    }
}