package DB;

import Food.Food;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DBQueryHandler {

    private  String url, user, pass;
    private  DBHandler dbHandler;

    public DBQueryHandler (String url, String user, String pass){
        this.url = url;
        this.user = user;
        this.pass = pass;
        try {
            this.dbHandler = DBHandler.getInstance(url, user, pass);
            dbHandler.connect();
        }catch(Exception e){
            e.printStackTrace();
        }

    }



    public Food getFood(int id){
        try {
            //TODO
            ResultSet rs = dbHandler.statment("SELECT FOOD_DES.NDB_No, FOOD_DES.Shrt_Desc, NUT_DATA.Nutr_Val, FOOD_DES.FdGrp_Cd  FROM FOOD_DES INNER JOIN NUT_DATA ON FOOD_DES.NDB_No = NUT_DATA.NDB_No WHERE FOOD_DES.NDB_No = " + id + " AND NUT_DATA.Nutr_No = 208;");
            rs.absolute(1);
            Food food = new Food(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
            return food;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Food> getFoodList(){
        ArrayList<Food> foods = new ArrayList<Food>();
        try {
            //TODO
            ResultSet rs = dbHandler.statment("SELECT FOOD_DES.NDB_No, FOOD_DES.Shrt_Desc, NUT_DATA.Nutr_Val, FOOD_DES.FdGrp_Cd  FROM FOOD_DES INNER JOIN NUT_DATA ON FOOD_DES.NDB_No = NUT_DATA.NDB_No WHERE NUT_DATA.Nutr_No = 208;");
            while (rs.next()){
                Food food = new Food(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                foods.add(food);
            }
            return foods;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }



}