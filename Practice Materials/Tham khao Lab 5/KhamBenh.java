
package LAB5;

public class KhamBenh {
    public static ArrayList<KhamBenhModel> showTenBN(String mabn){
        ArrayList<KhamBenhModel> DSBN = new ArrayList<>();
        try{
            String sql = "SELECT TENBN FROM BENHNHAN where MABN=? ";
            Connection con = null;
            con = ConnectionUtils.getMyConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, mabn);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            KhamBenhModel cms  = new KhamBenhModel();
            cms.setTENBN(rs.getString("TENBN"));
            DSBN.add(cms);
             }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return DSBN;
    }
    public static ArrayList<KhamBenhModel> getDSBacsi(){
        ArrayList<KhamBenhModel> DSBS = new ArrayList<>();
        try{
            String sql = "SELECT TENBS FROM BACSI";
            Connection con = null;
            con = ConnectionUtils.getMyConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DSBS.clear();
            while(rs.next()){
                 String TenBs = rs.getString(1);
                 KhamBenhModel sp = new KhamBenhModel(TenBs);
                 DSBS.add(sp);
             }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return DSBS;
    }
    public static boolean ThemKB(KhamBenhModel km) throws SQLException{
        Connection con = null;
        try{
            con = ConnectionUtils.getMyConnection();           
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        String sql = "INSERT INTO KHAMBENH(MAKB, MABN, MABS, NGAYKHAM, YEUCAUKHAM) VALUES(? , ?,(select MABS from BACSI where TENBS=?), ?, ?)";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, km.getMAKB());
        ps.setString(2, km.getMABN());
        ps.setString(3, km.getMABS());
        ps.setDate(4, km.getNGAYKHAM());
        ps.setString(5, km.getYEUCAUKHAM());
        
        return ps.executeUpdate()>0;       
    }
    public static String getNextMaKB() throws SQLException{
        int key;
        String str="";
        Connection con = null;
        try { 
            con = JDBCConnection.getJDBCConnection();
        } catch (ClassNotFoundException ex) {
        }
            
        String sql = "SELECT TOP 1 MAKB FROM KHAMBENH ORDER BY MAKB DESC";

        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            str = rs.getString("MAKB");
        }
        con.close();
        
        str = str.substring(2);
        key = Integer.parseInt(str);
        key++;
        
        if (key < 10)
            return "KB0"+key;
        else if (key < 100)
            return "KB"+key;

        
        return "";
    }
}
