/***********/
/* PACKAGE */
/***********/
package IR;

/*******************/
/* GENERAL IMPORTS */
/*******************/

/*******************/
/* PROJECT IMPORTS */
/*******************/

public class IRcommandList
{
	public IRcommand head;
	public IRcommandList tail;

	IRcommandList(IRcommand head, IRcommandList tail)
	{
		this.head = head;
		this.tail = tail;
	}
}
