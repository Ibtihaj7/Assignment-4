# Assignment-4

first i creata a abstract class because there is two type of colors and every type should print in defferent way ,so i create color class and make it abstract it contain red,green and blue member and i make datatype private becuse every color added to the system should contain The values of red,color and blue are fixed and should not change because the color values are fixed, they do not change,then i make DifferentColor and DefultColor classes and make them extend from Color , i add new member"nameOfColor" to DefultColor class to return it from toString function becuse the defult color should return the name of color insted of RGP ,and i write the code to override the function that print the name of defultColor, then i extend defferentColor from Color and override toString color to print RGP of color

then i create colorStore function contain HashMap to store every color and the object of it, then the getColor function receive 3 prameter(red,green,blue)
First, it checks the color if it already exists through cheackValidate. If it already exists, it returns it, and if it is not present, it checks the values if they are valid or not. If they are valid, he adds the new color and returns it ,and by this way, it makes only one object for each color.

Validata class contain functions to validate the values.


<img width="793" alt="Screen Shot 2022-10-29 at 22 36 29" src="https://user-images.githubusercontent.com/92644947/198851471-6fcfc844-71a0-4910-bfe6-4c85e5c0dc40.png">
