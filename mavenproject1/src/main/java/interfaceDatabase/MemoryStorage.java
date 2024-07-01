/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDatabase;
import java.util.ArrayList;

/**
 *
 * @author A-5
 */
public class MemoryStorage implements DataStorage{
    
//    private String data;
//    
//    @Override
//    public void writeData(String data) {
//        this.data = data;
//    }
//    
//    @Override
//    public String readData() {
//        return this.data;
//    }
    
    private ArrayList<String> data;
    
    public MemoryStorage() {
        this.data = new ArrayList<>();
    }
    
    @Override
    public void writeData(String data) {
        this.data.add(data);
    }
    
    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        for (String item : this.data) {
            sb.append(item);
        }
        return sb.toString();
    }
}