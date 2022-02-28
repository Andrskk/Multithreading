/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class comp346pa1driver {

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/

        Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();


        Server objServer = new Server();                        /* Start the server */
        objServer.start();


        Client objClient1 = new Client("sending");              /* Start the sending client */
        objClient1.start();


        Client objClient2 = new Client("receiving");            /* Start the receiving client */
        objClient2.start();
    }
}
/*
insert into project values ('5001', '2001', 'projectName1','4008', '40000', '2021-10-11','2021-11-11');
insert into project values ('5002', '2002', 'projectName2','4008', '70000', '2021-10-13','2022-01-15');
insert into project values ('5003', '2003', 'projectName3','4006', '50000', '2021-09-12','2022-01-29');
insert into project values ('5004', '2004', 'projectName4','4006', '60000', '2021-12-04','2022-02-02');
insert into project values ('5005', '2001', 'projectName5','4008', '40000', '2021-10-15','2021-11-15');







        */


