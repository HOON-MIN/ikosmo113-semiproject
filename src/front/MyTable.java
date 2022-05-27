package front;


import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class MyTable extends AbstractTableModel{
// JTable의 전달 받은 데이터를 행과 열로 표현해주는 객체이다. 안드로이드에 베이스어뎁터와 동일한 개념이다.
   
    //컬럼의 이름을 배열로 받기위해 선언 한다.
    private String[] colNames;
    //행과 열을 기준으로 저장할데이터를 선언한다.
    private Object[][] data;

    public MyTable(String[] colNames, Object[][] data) {
        this.colNames = colNames;
        this.data = data;
    }
    
    
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
      return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
}
