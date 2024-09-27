package indi.bairu.newsproj.domain;

/**
 * 新闻实体类
 * */
public class News {
    // 新闻编号
    private int newsid;
    //新闻的标题
    private String title;
    //新闻内容
    private String newscontent;
    // 新闻类型编号
    private int typeid;
    // 新闻类型名
    private String typename;
    // 新闻发布时间
    private String createdate;

    public News() {
    }

    public News(String title, String newscontent, int typeid, String createdate) {
        this.title = title;
        this.newscontent = newscontent;
        this.typeid = typeid;
        this.createdate = createdate;
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
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

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsid=" + newsid +
                ", title='" + title + '\'' +
                ", newscontent='" + newscontent + '\'' +
                ", typeid=" + typeid +
                ", createdate='" + createdate + '\'' +
                '}';
    }
}
