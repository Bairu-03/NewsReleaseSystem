package indi.bairu.newsproj.domain;

/**
 * 新闻类型实体类
 */
public class NewsType {
    private int typeid; // 新闻类型编号
    private String typename; // 新闻类型名

    public NewsType() {
    }

    public NewsType(int typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }

    public NewsType(String typename) {
        this.typename = typename;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "NewsType{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }
}
