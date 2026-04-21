package Java_Project_0421;

public interface Manageable {
      
    String bookid = null;
    //추상메소드
    //void addItem(Book book); //데이터 추가 
    void displayAll();
    void saveToFile();
    void loadFromFile();
    void addItem();

}
