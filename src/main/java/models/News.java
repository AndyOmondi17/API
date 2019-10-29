package models;

public class News {
    private int id;
    private String news_content;
    private int dpt_id;
    private String news_name;

    public News(String news_content, int department_id, String news_name) {
        this.news_content = news_content;
        this.dpt_id = dpt_id;
        this.news_name = news_name;
    }

    public int getNews_id() {
        return id;
    }

    public void setNews_id(int news_id) {
        this.id = news_id;
    }

    public String getNews_content() {
        return news_content;
    }

    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

    public int getDepartment_id() {
        return dpt_id;
    }

    public void setDepartment_id(int department_id) {
        this.dpt_id = dpt_id;
    }

    public String getNews_name() {
        return news_name;
    }

    public void setNews_name(String news_name) {
        this.news_name = news_name;
    }


}
