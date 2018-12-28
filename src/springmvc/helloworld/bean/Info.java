package springmvc.helloworld.bean;

public class Info {
    private Integer id;
    private String commodityName;

    public Info() {
    }

    public Info(Integer id, String commodityName) {
        this.id = id;
        this.commodityName = commodityName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
