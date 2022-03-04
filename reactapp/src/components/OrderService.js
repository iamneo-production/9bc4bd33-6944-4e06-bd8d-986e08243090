import axios from 'axios';

const ORDERS_API_BASE_URL="https://8080-bdcafacdfaacdbaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/user/getAllOrders";
class OrderService{
 
    getOrders(){
        return axios.get(ORDERS_API_BASE_URL);
    }
}
export default new  OrderService()