//c program to implement RALL approach 
#include <cstdio>
 // exceptions
 class file_error { } ;
 class open_error : public file_error { } ;
 class close_error : public file_error { } ;
 class write_error : public file_error { } ;
 //create class
 class file
 {
  public:
     file( const char* filename )
         :
         m_file_handle(std::fopen(filename, "w+"))
         {
         //check file is present or not
           if( m_file_handle == NULL )
            {
            //throw exception
             throw open_error() ;
            }
        }
     //constructor
     ~file()
     {
         std::fclose(m_file_handle) ;
     }
     void write( const char* str )
     {
         if( std::fputs(str, m_file_handle) == EOF )
         {
             throw write_error() ;
         }
     }
     void write( const char* buffer, std::size_t num_chars )
     {
         if( num_chars != 0 && std::fwrite(buffer, num_chars, 1, m_file_handle) == 0 )
         {
             throw write_error() ;
         }
     }
 private:
     std::FILE* m_file_handle ;
     file( const file & ) ;
     file & operator=( const file & ) ;
 } ;
 void example()
{
  file logfile("sample.txt") ;   
  logfile.write("Hello World!") ;
}
