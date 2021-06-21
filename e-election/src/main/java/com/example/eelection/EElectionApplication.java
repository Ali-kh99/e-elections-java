package com.example.eelection;

import com.example.eelection.rmiService.impl.AdminServiceImpl;
import com.example.eelection.rmiService.impl.RmiVoterServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EElectionApplication {
    

	public static void main(String[] args) {
            try {
                SpringApplication.run(EElectionApplication.class, args);
                // Voter:                
                RmiVoterServiceImpl rmiVoterServiceImpl = new RmiVoterServiceImpl();
                LocateRegistry.createRegistry(1099);
                Naming.rebind("voter", rmiVoterServiceImpl);
                
                // Admin :
                AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
                Naming.rebind("admin", adminServiceImpl);
                
            } catch (RemoteException ex) {
                System.err.println("RemoteException " + ex );
            } catch (MalformedURLException ex) {
                System.err.println("MalformedURLException " + ex );
            }
            
	}

}
