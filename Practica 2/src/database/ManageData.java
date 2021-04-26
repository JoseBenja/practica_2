package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Interaction;

public class ManageData {
    private String message = "";
    
    public String AddDevice(Connection connection, Interaction interaction) {
        String sql = "INSERT INTO DEVICE (tipo, email, nombre, visible_device, estado, numero_telefono, dispositivo_asociado)"
                + " VALUES(" + interaction.getTypeDevice() + ", " + interaction.getMail() + ", " + interaction.getNameDevice() + ", " + interaction.isVisible() + ", " + interaction.isStatus() + ")";
        
        return message;
    }
    
    public String ModifyDevice(Connection connection, Interaction interaction, String id) {
        String sql = "UPDATE DISPOSITIVO SET email = " + interaction.getMail() + ", nombre = " + interaction.getNameDevice() + ", visible_device = " + interaction.isVisible() + ", estado =  " + interaction.isStatus() 
                + " WHERE Id_Devie";
        
        return message;
    }
    
    public String DeleteDevice(Connection connection, int id) {
        
        
        return message;
    }
}
