package ImpProgram;
/* there is no multiple inheritance in class in java to avoid diamond issue
 * so interface concepts come
 */
interface living
{
	void sound();
	
}
interface bird extends living
{
	void sound();
	
}
interface Mammel extends living
{
	void sound();
	
}
class bat implements bird, Mammel
{
	void sound();
	
}

public class DiamondProblemInheritence {

}
