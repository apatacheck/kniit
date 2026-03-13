package org.kniit.hw.lab1.task4;

 class TrafficLightThread extends Thread {
     private  TrafficLight trafficLight;

     public TrafficLightThread(TrafficLight trafficLight){
         this.trafficLight = trafficLight;
     }

     @Override
     public void run(){
         while (true){
             trafficLight.changeColor();
             try {
                 Thread.sleep(5000);
             } catch (InterruptedException e) {
                 System.out.println("Прервано");
             }
         }
     }

}
