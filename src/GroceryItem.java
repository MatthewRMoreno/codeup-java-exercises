public class GroceryItem {
    private String name;
    private int categoryNum;
    private int quantity;

    public GroceryItem(String name, int categoryNum, int quantity) {
        this.name = name;
        this.categoryNum = categoryNum;
        this.quantity = quantity;
    }

    public GroceryItem() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(int categoryNum) {
        this.categoryNum = categoryNum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
