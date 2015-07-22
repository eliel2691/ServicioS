
package serv;

public class SERV {
    
    static void ciclo(String x){
        String men="";
        int cont=1;
        char arr[]=new char [x.length()];
     
        for(int i =0;i<x.length();i++){
           arr[i]=x.charAt(i);
        }
        for(int i=0;i<x.length();i++){
            
           switch(arr[i]){
                 case 'a': 
                     arr[i]='u';
                   break;
                 case 'A':
                     arr[i]='U';
                     break;
                 case 'b': 
                     arr[i]='v';
                   break;
                 case 'B':
                     arr[i]='V';
                     break;
                 case 'c': 
                    arr[i]='w'; 
                   break;
                 case 'C':
                     arr[i]='W';
                     break;
                     
                  case 'd': 
                     arr[i]='x';
                   break;
                 case 'D':
                     arr[i]='X';
                     break;
                     
                 case 'e': 
                     arr[i]='y';
                   break;
                 case 'E':
                     arr[i]='Y';
                     break;
                     
                 case 'f': 
                     arr[i]='z';
                   break;
                 case 'F':
                  arr[i]='Z';
                     break;
                     
                 case 'g': 
                    arr[i]='a'; 
                   break;
                 case 'G':
                     arr[i]='A';
                     break;
                     
                 case 'h': 
                     arr[i]='b';
                   break;
                 case 'H':
                     arr[i]='B';
                     break;
                     
                 case 'i': 
                     arr[i]='c';
                   break;
                 case 'I':
                     arr[i]='C';
                     break;
                     
                 case 'j': 
                     arr[i]='d';
                   break;
                 case 'J':
                     arr[i]='D';
                     break;
                     
                 case 'k': 
                     arr[i]='e';
                   break;
                 case 'K':
                    arr[i]='E';
                     break;
                     
                 case 'l': 
                 arr[i]='f';    
                   break;
                 case 'L':
                     arr[i]='F';
                     break;
                     
                 case 'm': 
                     arr[i]='g';
                   break;
                 case 'M':
                     arr[i]='G';
                     break;
                     
                 case 'n': 
                     arr[i]='h';
                   break;
                 case 'N':
                     arr[i]='H';
                     break;
                     
                 case 'ñ': 
                     arr[i]='i';
                   break;
                 case 'Ñ':
                     arr[i]='I';
                     break;
                     
                 case 'o': 
                    arr[i]='j'; 
                   break;
                 case 'O':
                     arr[i]='J';
                     break;
                     
                 case 'p': 
                     arr[i]='k';
                   break;
                 case 'P':
                     arr[i]='K';
                     break;
                     
                 case 'q': 
                     arr[i]='l';
                   break;
                 case 'Q':
                     arr[i]='L';
                     break;
                     
                 case 'r': 
                     arr[i]='m';
                   break;
                 case 'R':
                    arr[i]='M'; 
                     break;
                     
                 case 's': 
                     arr[i]='n';
                   break;
                 case 'S':
                     arr[i]='N';
                     break;
                     
                 case 't': 
                     arr[i]='ñ';
                   break;
                 case 'T':
                     arr[i]='Ñ';
                     break;
                     
                 case 'u': 
                     arr[i]='o';
                   break;
                 case 'U':
                     arr[i]='O';
                     break;
                     
                 case 'v': 
                     arr[i]='p';
                   break;
                 case 'V':
                     arr[i]='P';
                     break;
                     
                 case 'w': 
                     arr[i]='q';
                   break;
                 case 'W':
                     arr[i]='Q';
                     break;
                     
                 case 'x': 
                     arr[i]='r';
                   break;
                 case 'X':
                     arr[i]='R';
                     break;
                     
                 case 'y': 
                     arr[i]='s';
                   break;
                 case 'Y':
                     arr[i]='S';
                     break;
                     
                 case 'z': 
                     arr[i]='t';
                   break;
                 case 'Z':
                     arr[i]='T';
                     break;
                         
                }
        }
        String acum="";
        for(int i=0;i<x.length();i++){
            acum=acum+""+arr[i];
        }
        System.out.println(acum);
        
    //   System.out.println(x);
    //   System.out.println(cont);
    }
   
    public static void main(String[] args) {

   
      String y="Ynkxquip Nuqrky, wak ks as vxñsiñvñu Jueqk zksñg vxkbñyzu qqgrgx\n" +
"Ynkxxñsluxj, ky as jkzkizñbk vxñbgju, gqzu, jkqmgju, lxñu, ñxusñiu,\n" +
"ñsmksñuyu k ñszkqkizagqrkszk ñswañkzu. Cgzyus qu jkyixñhk lñyñigrkszk\n" +
"jkq yñmañkszk ruju gq vuiu jk iusuikxyk\n" +
"\n Ya kyzgzaxg yuhxkvgyghg quy ykñy vñky, e kxg zgs kdzxguxjñsgxñgrkszk\n" +
"ksoazu, wak vxujaiñg qg ñrvxkyñus jk ykx gas rgy gqzu. Zksñg qg rñxgjg\n" +
"gmajg e vkskzxgszk, e ya sgxñf, lñsg e gmañqktg, jghg gq iusoaszu jk yay\n" +
"lgiiñusky as gñxk jk bñbkfg e jk xkyuqaiñus.\n" +
"\n" +
"Gaswak rainuy ngs skmgju kyzg uviñus, kq kyixñzux hgyu ya jkyixñviñus\n" +
"jk Nuqrky ks as gszñmau grñmu jk qg lgiaqzgj, qqgrgju Ynkxxñsluxj, kq\n" +
"iagq qqkmu g luxrgx vgxzk jk Yiuzqgsj Egxj, mxgs grñmu e gqñgju jk iusgs\n" +
"jueqk e iaegy jkyixñviñusky jk bñbksiñgy vuqñiñgigy ñsyvñxgxus raingy jk\n" +
"yay uhxgy.";
      ciclo(y);
    
     
    }
    
}
