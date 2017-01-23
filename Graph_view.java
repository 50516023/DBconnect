package dbconnect;

import java.awt.BorderLayout; 
import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout; 
import java.awt.Frame; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.WindowEvent; 
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.category.DefaultCategoryDataset; 

	public class Graph_view extends Frame implements ActionListener,WindowListener{ 
	 	public Graph_view()  { 
	 		addWindowListener(this); 
	 		setTitle("Graph"); 
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			int id, year,ton; 			
	 		String name; 
			ResultSet rs; 
			MySQL mysql = new MySQL(); 
			rs = mysql.selectAll(); 
			DefaultCategoryDataset data = new DefaultCategoryDataset(); 
			try { 
				while(rs.next()){ 
					id = rs.getInt("id"); 
			 	    name = rs.getString("name"); 
					year = rs.getInt("year"); 
			 		ton = rs.getInt("ton"); 
			 		data.addValue(ton, name, String.valueOf(year)); 
				}  //try catchで囲む 
			} catch (SQLException e) { 
			 			// TODO Auto-generated catch block 
			 			e.printStackTrace(); 
			}
			JFreeChart chart =  
				      ChartFactory.createLineChart("Import Volume", 
				                                   "Year", 
				                                   "Ton", 
				                                   data, 
				                                   PlotOrientation.HORIZONTAL, 
				                                   true, 
				                                   false, 
				                                   false);  
		ChartPanel cpanel = new ChartPanel(chart); 
		add(cpanel);
	 	}
	 	
	 	public void windowOpened1(WindowEvent e) { 
	 		// TODO 自動生成されたメソッド・スタブ 
	 		
	 	} 
	 	@Override 
	 	public void windowClosing(WindowEvent e) { 
	 		// TODO 自動生成されたメソッド・スタブ 
	 		
	 		System.exit(0); 
		} 
		@Override 
	 	public void windowClosed(WindowEvent e) { 
	 		// TODO 自動生成されたメソッド・スタブ 
			
	 		System.exit(0); 
	 	} 
	 	@Override 
	 	public void windowIconified(WindowEvent e) { 
	 		// TODO 自動生成されたメソッド・スタブ 
	 		
	 		 
	 	} 
	 
	 
	 	@Override 
	 	public void windowDeiconified(WindowEvent e) { 
	 		// TODO 自動生成されたメソッド・スタブ 
	 		 
	 	} 
	 
	 
	 	@Override 
	 	public void windowActivated(WindowEvent e) { 
	 		// TODO 自動生成されたメソッド・スタブ 
	 		 
		} 
		@Override 
	 	public void windowDeactivated(WindowEvent e) { 
	 		// TODO 自動生成されたメソッド・スタブ 
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void windowClosing1(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void windowClosed1(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void windowIconified1(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void windowDeiconified1(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void windowActivated1(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void windowDeactivated1(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
