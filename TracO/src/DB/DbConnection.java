package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public void connectToMySQL(){


		try {
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl= "jdbc:mysql://localhost/MYTRACO";
			//String database="CREATE DATABASE MYTRACO";
			Connection connection = DriverManager.getConnection(dbUrl,"root","zivbru");
			Statement statement = connection.createStatement();
			//statement.executeUpdate(database);			
			final  String SEARCH_TABLE= "create table Search("
					+" SearchId varchar(32) NOT NULL,"
					+ "PRIMARY KEY (SearchId)  ,"
					+ "Type VARCHAR(20)NOT NULL , "
					+ "TypeOfFlight VARCHAR(20) NOT NULL, "
					+ "DateDepart Date,"
					+ "DateReturn Date,"
					+ "Src VARCHAR(20) NOT NULL,"
					+ "Dest VARCHAR(20) NOT NULL,"
					+ "TypeOfPerson VARCHAR(20) NOT NULL,"
					+ "TypeOfClass VARCHAR(20) NOT NULL"
					+ ")";
			statement.executeUpdate(SEARCH_TABLE);

			final String RESULT_TABLE=" create table Result("
					+ "ResultId varchar(32) NOT NULL,"
					+ "SearchId varchar(32) NOT NULL,"
					+ "PRIMARY KEY (ResultId),"
					+ "FOREIGN KEY (SearchId) REFERENCES "+"MYTRACO"
					+ ".Search(SearchId))";
			statement.executeUpdate(RESULT_TABLE);



			final String TRIP_TABLE=" create table Trip("
					+ "TripId varchar(32) NOT NULL,"
					+ "TicketId varchar(32) NOT NULL,"
					+ "PRIMARY KEY(TripId),"
					+ "TotalPrice FLOAT NOT NULL)";
			statement.executeUpdate(TRIP_TABLE);

			final  String TICKET_TABLE = "create table Ticket ( "
					+ "TicketId varchar(32) NOT NULL,"
					+ "PRIMARY KEY (TicketId) ,"
					+ "TripId varchar(32) NOT NULL,"
					+ "FOREIGN KEY (TripId) REFERENCES "+"MYTRACO"
					+ ".Trip(TripId),"
					+ "TypeOfTraval VARCHAR(20),"
					+ "Depart Date,"
					+ "Arrival Date,"
					+ "HourDepart time, "
					+ "HourArrival time,"
					+ "Src VARCHAR(20),"
					+ "Dest VARCHAR(20))";
			statement.executeUpdate(TICKET_TABLE);

			final  String LOCATION_TABLE= "create table Location("
					+ "Country VARCHAR(20) NOT NULL,"
					+ "City VARCHAR(20) NOT NULL,"
					+ "Station VARCHAR(20) NOT NULL,"
					+ "Name VARCHAR(20) NOT NULL)";

			statement.executeUpdate(LOCATION_TABLE);

			final String TYPE_OF_CLASS_TABLE="create table TypeOfClass("
					+"Type VARCHAR(20)NOT NULL) ";
			statement.executeUpdate(TYPE_OF_CLASS_TABLE);

			final String TYPE_OF_PERSON_TABLE="create table TypeOfPerson("
					+"Type VARCHAR(20)NOT NULL,"
					+ "Age INT NOT NULL,"
					+ "NumOfPerson INT NOT NULL) ";
			statement.executeUpdate(TYPE_OF_PERSON_TABLE);


			/*ResultSet rs = statement.executeQuery("SELECT * FROM customer");
			while(rs.next()){


				System.out.println(rs.getString("first_name")+ " "+rs.getString("last_name"));
			}*/

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}







