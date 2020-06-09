/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Hasnath Jami
 */
class Show {
   
    
    private int Id;
    private String DisasterType,DisasterName;
    private String RegionName;
    private int Injured,Missing,Death;
     private float TotalAmount;
    private int ContributingCountries;
    
    private int  Yearr;
    private float EconomicDamage;
   
    
    
    public Show(int Id,String DisasterName,String DisasterType,String RegionName,int Injured,int Missing,int Death,float TotalAmount,int ContributingCountries,int Yearr,float EconomicDamage )
            
    {
        this.Id=Id;
        this.DisasterName=DisasterName;
        this.DisasterType=DisasterType;
        this.RegionName=RegionName;
        this.Injured=Injured;
        this.Missing=Missing;
        this.Death=Death;
        
        this.TotalAmount=TotalAmount;
        this.ContributingCountries=ContributingCountries;
        this.Yearr=Yearr;
        this.EconomicDamage=EconomicDamage;
           
        
    }
    
  
    public int getId()
    {
        return Id;
    }
    public String getDisasterName()
    {
        return DisasterName;
    }
    
    public String getDisasterType()
    {
        return DisasterType;
    }
    public String getRegionName()
    {
        return RegionName;
    }
    
    public int getInjured()
    {
        return Injured;
    }
    
    public int getMissing()
    {
        return Missing;
    }
    
    public int getDeath()
            
    {
        return Death;
    }
    
    
    
     public float getTotalAmount()
    {
        return TotalAmount;
    }
    public int getContributingCountries()
    {
        return ContributingCountries;
    }
    
    public int getYearr()
    {
        
        return Yearr;
    }
    
    public float getEconomicDamage()
    {
        return EconomicDamage;
    }
   
    
    
    
    
    
}
