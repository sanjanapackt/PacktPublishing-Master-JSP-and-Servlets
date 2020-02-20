package mahajan1;

public class Students {
int Roll_No ;
float Meng ;
int Mcomp ;
float Mmaths ;
public Students(int Roll_No,float Meng,int Mcomp,float Mmaths) // constructor
{
this.Roll_No=Roll_No ;
this.Meng=Meng ;
this.Mcomp=Mcomp ;
this.Mmaths=Mmaths ;
}
public float Percentage()
{
float Pc ;
Pc=(Meng+Mcomp+Mmaths)/300 * 100 ;
return Pc ;
}
} // end of the class
