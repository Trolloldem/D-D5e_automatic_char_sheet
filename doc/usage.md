## Usage
1. [Steps to use the tool](#steps)
2. [Important usage notes](#notes)
3. [Other command parameters](#other)
### Steps to use the tool <a name="steps"/>
To use the tool, you need to:
1. open the terminal(Linux) or open the command prompt(Windows);
2. navigate to the folder where you've downloaded the tool jar;
3. use this command:

         java -jar D_Automatic_Charsheet_Compiler.jar <DDM or TXT file name here>
4. this command will create inside the current directory a new folder named 'outputs';
5. to check your charsheets, open the outputs folder.

If you want to know hot to write a DDM or TXT file in order to generate your characters,
follow the steps presentend in [this guide](SingleChar.md).
### Important usage notes<a name="notes"/>
Remember this points when using the tool:
1. the working directory of the tool will be the one where you're calling the command.
For example by calling: 

         java -jar ./DownloadFolder/D_Automatic_Charsheet_Compiler.jar <DDMFile>
         
   the working directory of the process will be the parent directory of 'DownloadFolder';
 2. this means that DDMFile has to be located inside the parent directory in order to be processed;
 3. you can specify the relative path to DDMFile if the file does not contain 'import' statements;
 4. if the DDM file contains import statements, they will probably break due to the incorrect working directory.

### Other command parameters<a name="other"/>
If you need a remainder about the usage command, just tipe

        java -jar ./DownloadFolder/D_Automatic_Charsheet_Compiler.jar -h
        
or
 
        java -jar ./DownloadFolder/D_Automatic_Charsheet_Compiler.jar -help