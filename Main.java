public class Main 
{
        float a;
        float b; 
        float c;

        public Main(float a, float b , float c)
        {
            if(this.a > this.b || this.a > this.c)
            {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            else if(this.b > this.a || this.b > this.c)
            {
                this.b = a;
                this.a = b;
                this.c = c;
            }
            else if(this.c > this.a || this.c > this.b)
            {
                this.c = a;
                this.a = b;
                this.c = c;
            }
            else
            {
                this.a = this. a;
                this.b = this.b;
                this.c = this.c;
            }
            
        

        }
}