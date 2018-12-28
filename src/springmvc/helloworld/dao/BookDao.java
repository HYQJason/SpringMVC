package springmvc.helloworld.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

private  int  data=1;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
