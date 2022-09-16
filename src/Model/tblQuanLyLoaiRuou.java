package Model;
public class tblQuanLyLoaiRuou {
    private String MALOAIRUOU, TENLOAIRUOU;

    public tblQuanLyLoaiRuou(String MALOAIRUOU, String TENLOAIRUOU) {
        this.MALOAIRUOU = MALOAIRUOU;
        this.TENLOAIRUOU = TENLOAIRUOU;
    }

    public tblQuanLyLoaiRuou() {
    }

    public String getMALOAIRUOU() {
        return MALOAIRUOU;
    }

    public void setMALOAIRUOU(String MALOAIRUOU) {
        this.MALOAIRUOU = MALOAIRUOU;
    }

    public String getTENLOAIRUOU() {
        return TENLOAIRUOU;
    }

    public void setTENLOAIRUOU(String TENLOAIRUOU) {
        this.TENLOAIRUOU = TENLOAIRUOU;
    }
    
    
}
