
package LAB5;
import java.sql.Date;

public class KhamBenhModel {
    private String MAKB ;
    private String MABN;
    private String TENBN;
    private String MABS;
    private Date NGAYKHAM;
    private String YEUCAUKHAM;
    private String KETLUAN;
    private int THANHTOAN;
    private String TENBS;

    
    
    public KhamBenhModel(){
        
    }
    public KhamBenhModel(String TENBS){
        this.TENBS=TENBS;
    }
    public KhamBenhModel(String MAKB, String MABN, String MABS,Date NGAYKHAM, String YEUCAUKHAM){
        this.MAKB=MAKB;
        this.MABN=MABN;
        this.MABS=MABS;
        this.NGAYKHAM=NGAYKHAM;
        this.YEUCAUKHAM=YEUCAUKHAM;
    }
  ...........
}
