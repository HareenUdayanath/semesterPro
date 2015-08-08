package processsimulator;

import java.util.ArrayList;


public class Schedular {
    private ArrayList<AProcess> newProcessList;
    private AProcess[] processList;
    private ReadyQueue readyQueue;
    private int currentTime;
    private AProcess next;
    private int pTime;
    
    
    public Schedular(ArrayList<AProcess> processList){
        this.newProcessList = processList;
        this.processList = new AProcess[processList.size()];
        for(int i=0;i<processList.size();i++){
            this.processList[i] = processList.get(i);
        }
        this.currentTime = 0;
        this.createReady();
        this.next = null;
    }
    
    public AProcess hrrn(){
        next = this.getReadyQueue().remove();
        this.currentTime+=next.getServiceTime();
        next.setExcutedTime(next.getServiceTime());
        
        for(AProcess p:this.newProcessList){
            if(p.getArrivalTime()<=this.currentTime){                
                this.getReadyQueue().add(p);         
            }
        }
        for(AProcess p:this.getReadyQueue()){
            p.setPriority(giveRatio(p,this.currentTime));            
            this.newProcessList.remove(p);            
        }
        
        return next;
    }    
     
    public AProcess hrrnPree(){
        next = this.getReadyQueue().remove();
        this.currentTime+=pTime;
        next.setExcutedTime(next.getExcutedTime()+pTime);      
        
        for(AProcess p:this.newProcessList){
            if(p.getArrivalTime()<=this.currentTime){                 
                this.getReadyQueue().add(p);         
            }
        }
        for(AProcess p:this.getReadyQueue()){
            p.setIsComeFirst(true);
            p.setPriority(giveRatioPree(p,this.currentTime));            
            this.newProcessList.remove(p);            
        }
        
        if(next.getExcutedTime()<next.getServiceTime()){
            next.setIsComeFirst(false);
            next.setArrivalTime(currentTime);
            next.setPriority(giveRatioPree(next,this.currentTime));
            this.getReadyQueue().add(next);
        }
        
        return next;
    }   
    
    public AProcess roundRobin(){
        next = this.getReadyQueue().pop();
        this.currentTime+=pTime;
        next.setExcutedTime(next.getExcutedTime()+pTime);      
        
        for(AProcess p:this.newProcessList){
            if(p.getArrivalTime()<=this.currentTime){                 
                this.getReadyQueue().add(p);         
            }
        }
        for(AProcess p:this.getReadyQueue()){               
            this.newProcessList.remove(p);            
        }
        
        if(next.getExcutedTime()<next.getServiceTime()){           
            this.getReadyQueue().add(next);
        }        
        return next;
    }   
    
    public AProcess firstComeFirstServe(){
        next = this.getReadyQueue().pop();
        this.currentTime+=next.getServiceTime();  
        next.setExcutedTime(next.getServiceTime());
        
        for(AProcess p:this.newProcessList){
            if(p.getArrivalTime()<=this.currentTime){                 
                this.getReadyQueue().add(p);         
            }
        }
        for(AProcess p:this.getReadyQueue()){               
            this.newProcessList.remove(p);            
        }            
        return next;
    }   
    
    public double getThroughput(){
        int count = 0;
        for(AProcess p:this.processList){
            if(p.getExcutedTime()>=p.getServiceTime())
                count++;
        }
        return ((float)count)/this.currentTime;
    }
    
    private double giveRatio(AProcess p,int time){        
        return ((time-p.getArrivalTime())+p.getServiceTime())/((double)p.getServiceTime());
    }
    
    private double giveRatioPree(AProcess p,int time){        
        return ((time-p.getArrivalTime())+(p.getServiceTime()-p.getExcutedTime()))/((double)(p.getServiceTime()-p.getExcutedTime()));
    }
        
    private void createReady(){
        this.readyQueue = new ReadyQueue();
        for(AProcess p:this.newProcessList){
            if(p.getArrivalTime()==0){
                this.getReadyQueue().add(p);
                this.newProcessList.remove(p);
                break;
            }
                
        }        
    }

    /**
     * @return the readyQueue
     */
    public ReadyQueue getReadyQueue() {
        return readyQueue;
    }

    /**
     * @return the pTime
     */
    public int getpTime() {
        return pTime;
    }

    /**
     * @param pTime the pTime to set
     */
    public void setpTime(int pTime) {
        this.pTime = pTime;
    }
    
}
