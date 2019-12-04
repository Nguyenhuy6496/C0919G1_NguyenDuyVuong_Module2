package data;

import model.Customers;

import java.util.*;

public class DataCustomers {
    //tạo danh sách người dùng có sẵn để hiện thị lúc đầu tiên
    private static final Map<Integer, Customers> listCUSTOMERS = new HashMap<Integer, Customers>();

    static {
        initCustomers();
    }

    private static void initCustomers() {
        Customers cus1 = new Customers(1, "Nguyễn Duy Vương", "Đà Nẵng", "nguyenduyvuong@gmail.com");
        Customers cus2 = new Customers(2, "Nguyễn Xuân Hương", "Thái Bình", "nguyenxuanhuong@gmail.com");
        Customers cus3 = new Customers(3, "Nguyễn Huy", "Hà Nội", "nguyenhuy@gmail.com");

        //thêm khách hàng vào danh sách listCUSTOMERS
        listCUSTOMERS.put(cus1.getCustomerId(), cus1);
        listCUSTOMERS.put(cus2.getCustomerId(), cus2);
        listCUSTOMERS.put(cus3.getCustomerId(), cus3);
    }

    //viết phương thức get thông tin mới của customers theo id
    public static Customers getCustomer(int customerId) {
        return listCUSTOMERS.get(customerId);
    }

    //viết phương thức thêm mới dữ liệu khách hàng
    public static void addCustomer(Customers customers) {
        listCUSTOMERS.put(customers.getCustomerId(), customers);
    }

    //viết phương thức cập nhật dữ liệu thông tin khách hàng
    public static Customers updateAndCreateCustomer(Customers customers) {
        listCUSTOMERS.put(customers.getCustomerId(), customers);
        return customers;
    }

    //viết phương thức xóa dữ liệu thông tin khách hàng
    public static void deleteCustomer(int customerId){
        listCUSTOMERS.remove(customerId);
    }

    //viết phương thúc lấy danh sách tất cả dữ liệu người dùng
    public static List<Customers> getAllCustomers() {
        Collection<Customers> customers = listCUSTOMERS.values();
        return new ArrayList<>(customers);
    }


}
