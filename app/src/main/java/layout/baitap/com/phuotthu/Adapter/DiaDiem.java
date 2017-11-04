package layout.baitap.com.phuotthu.Adapter;

/**
 * Created by DELL on 9/19/2017.
 */

public class DiaDiem {
    private int image;
    private String name;
    private String address;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public DiaDiem(){
        this.name ="";
        this.address="";
        this.image=0;
    }

    public DiaDiem(int image, String name, String address) {
        this.image = image;
        this.name = name;
        this.address = address;
    }
}
