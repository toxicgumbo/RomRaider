package enginuity.newmaps.definition.index;

import enginuity.util.Nameable;
import java.io.File;
import java.io.Serializable;

public class IndexItem implements Nameable, Serializable {
    
    private String name = "";
    private String base = "";
    private File file = new File("");
    private int idAddress = 0;
    private String idString = "";
    private boolean isAbstract = false;
    private String checksum = "";
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }
    
    public String toString() {
        return "Name: " + name +
                "\tBase: " + base + 
                "\tFile: " + file +
                "\tAddress: " + idAddress +
                "\tID: " + idString + 
                "\tAbstract: " + isAbstract +
                "\tChecksum: " + checksum;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
}
