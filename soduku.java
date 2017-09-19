	package chess;
	public class soduku {
		public static void main(String[] args) {
			//puzzle
			int j;
			int soduku[][] = {
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9},
					{1,2,3},{4,5,6},{7,8,9}
					};
			//puzzle placement in array used to convert j and i
			int soduku1[][]=	{			
					{00,01,02},{10,11,12},{20,21,22},
					{30,31,32},{40,41,42},{50,51,52},
					{60,61,62},{70,71,72},{80,81,82},
					{90,91,92},{100,101,102},{110,111,112},
					{120,121,122},{130,131,132},{140,141,142},
					{150,151,152},{160,161,162},{170,171,172},
					{180,181,182},{190,191,192},{200,201,202},
					{210,211,212},{220,221,222},{230,231,232},
					{240,241,242},{250,251,252},{260,261,262}
					};
					
			//checks to see if puzzle is solved
					
			int a1 = 9;
			int a2 = 9;
			int a3 = 9;
			int a4 = 9;
			int a5 = 9;
			int a6 = 9;
			int a7 = 9;
			int a8 = 9;
			int a9 = 9;
			int i;
			//what needs to be found in array
			int array[][]={{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
	{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
	{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
	{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
	{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
	{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
	{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};

			int sol[][]= {
					{soduku[0][0],soduku[0][1],soduku[0][2],soduku[1][0],soduku[1][1],soduku[1][2],soduku[2][0],soduku[2][1],soduku[2][2]},
					{soduku[3][0],soduku[3][1],soduku[3][2],soduku[4][0],soduku[4][1],soduku[4][2],soduku[5][0],soduku[5][1],soduku[5][2]},
					{soduku[6][0],soduku[6][1],soduku[6][2],soduku[7][0],soduku[7][1],soduku[7][2],soduku[8][0],soduku[8][1],soduku[8][2]},
					{soduku[9][0],soduku[9][1],soduku[9][2],soduku[10][0],soduku[10][1],soduku[10][2],soduku[11][0],soduku[11][1],soduku[11][2]},
					{soduku[12][0],soduku[12][1],soduku[12][2],soduku[13][0],soduku[13][1],soduku[13][2],soduku[14][0],soduku[14][1],soduku[14][2]},
					{soduku[15][0],soduku[15][1],soduku[15][2],soduku[16][0],soduku[16][1],soduku[16][2],soduku[17][0],soduku[17][1],soduku[17][2]},
					{soduku[18][0],soduku[18][1],soduku[18][2],soduku[19][0],soduku[19][1],soduku[19][2],soduku[20][0],soduku[20][1],soduku[20][2]},
					{soduku[21][0],soduku[21][1],soduku[21][2],soduku[22][0],soduku[22][1],soduku[22][2],soduku[23][0],soduku[23][1],soduku[23][2]},
					{soduku[24][0],soduku[24][1],soduku[24][2],soduku[25][0],soduku[25][1],soduku[25][2],soduku[26][0],soduku[26][1],soduku[26][2]},

					{soduku[0][0],soduku[0][1],soduku[0][2],soduku[3][0],soduku[3][1],soduku[3][2],soduku[6][0],soduku[6][1],soduku[6][2]},
					{soduku[1][0],soduku[1][1],soduku[1][2],soduku[4][0],soduku[4][1],soduku[4][2],soduku[7][0],soduku[7][1],soduku[7][2]},
					{soduku[2][0],soduku[2][1],soduku[2][2],soduku[5][0],soduku[5][1],soduku[5][2],soduku[8][0],soduku[8][1],soduku[8][2]},
					{soduku[9][0],soduku[9][1],soduku[9][2],soduku[10][0],soduku[10][1],soduku[10][2],soduku[11][0],soduku[11][1],soduku[11][2]},
					{soduku[12][0],soduku[12][1],soduku[12][2],soduku[13][0],soduku[13][1],soduku[13][2],soduku[14][0],soduku[14][1],soduku[14][2]},
					{soduku[15][0],soduku[15][1],soduku[15][2],soduku[16][0],soduku[16][1],soduku[16][2],soduku[17][0],soduku[17][1],soduku[17][2]},
					{soduku[18][0],soduku[18][1],soduku[18][2],soduku[19][0],soduku[19][1],soduku[19][2],soduku[20][0],soduku[20][1],soduku[20][2]},
					{soduku[21][0],soduku[21][1],soduku[21][2],soduku[22][0],soduku[22][1],soduku[22][2],soduku[23][0],soduku[23][1],soduku[23][2]},
					{soduku[24][0],soduku[24][1],soduku[24][2],soduku[25][0],soduku[25][1],soduku[25][2],soduku[26][0],soduku[26][1],soduku[26][2]},
					
					{soduku[0][0],soduku[3][0],soduku[6][0],soduku[9][0],soduku[12][0],soduku[15][0],soduku[18][0],soduku[21][0],soduku[24][0]},
					{soduku[0][1],soduku[3][1],soduku[6][1],soduku[9][1],soduku[12][1],soduku[15][1],soduku[18][1],soduku[21][1],soduku[24][1]},
					{soduku[0][2],soduku[3][2],soduku[6][2],soduku[9][2],soduku[12][2],soduku[15][2],soduku[18][2],soduku[21][2],soduku[24][2]},
					{soduku[1][0],soduku[4][0],soduku[7][0],soduku[10][0],soduku[13][0],soduku[16][0],soduku[19][0],soduku[22][0],soduku[25][0]},
					{soduku[1][1],soduku[4][1],soduku[7][1],soduku[10][1],soduku[13][1],soduku[16][1],soduku[19][1],soduku[22][1],soduku[25][1]},
					{soduku[1][2],soduku[4][2],soduku[7][2],soduku[10][2],soduku[13][2],soduku[16][2],soduku[19][2],soduku[22][2],soduku[25][2]},
					
					{soduku[2][0],soduku[5][0],soduku[8][0],soduku[11][0],soduku[14][0],soduku[17][0],soduku[20][0],soduku[23][0],soduku[26][0]},
					{soduku[2][1],soduku[5][1],soduku[8][1],soduku[11][1],soduku[14][1],soduku[17][1],soduku[20][1],soduku[23][1],soduku[26][1]},
					{soduku[2][2],soduku[5][2],soduku[8][2],soduku[11][2],soduku[14][2],soduku[17][2],soduku[20][2],soduku[23][2],soduku[26][2]}
					};
					
			//The solution's helper array
			int solh[][]={
			{0,1,2,10,11,12,20,21,22},
			{30,31,32,40,41,42,50,51,52},
			{60,61,62,70,71,72,80,81,82},
			{90,91,92,100,101,102,110,111,112},
			{120,121,122,130,131,132,140,141,142},
			{150,151,152,160,161,162,170,171,172},
			{180,181,182,190,191,192,200,201,202},
			{210,211,212,220,221,222,230,231,232},
			{240,241,242,250,251,252,260,261,262},

			{0,1,2,30,31,32,60,61,62},
			{10,11,12,40,41,42,70,71,72},
			{20,21,22,50,51,52,80,81,82},
			{90,91,92,100,101,102,110,111,112},
			{120,121,122,130,131,132,140,141,142},
			{150,151,152,160,161,162,170,171,172},
			{180,181,182,190,191,192,200,201,202},
			{210,211,212,220,221,222,230,231,232},
			{240,241,242,250,251,252,260,261,262},
			
			{0,30,60,90,120,150,180,210,240},
			{1,31,61,91,121,151,181,211,241},
			{2,32,62,92,122,152,182,212,242},
			{10,40,70,100,130,160,190,220,250},
			{11,41,71,101,131,161,191,221,251},
			{12,42,72,102,132,162,192,222,252},
			
			{20,50,80,110,140,170,200,230,260},
			{21,51,81,111,141,171,201,231,261},
			{22,52,82,112,142,172,202,232,262}
			};
	// the map of every number in the puzzle
	//put the placeholder for the arrays
	//checks how many number there should be
			for(j=0;j<27;j++)
			{
				i = 0;
				for(i=0;i<3;i++)
				{
					  switch(soduku[j][i]) 
					  {
			            case 1:
			                a1--;
			                break;

			            case 2:
			                a2--;
			                break;

			            case 3:
			                a3--;
			                break;

			            case 4:
			                a4--;
			                break;

			            case 5:
			                a5--;
			                break;

			            case 6:
			                a6--;
			                break;

			            case 7:
			                a7--;
			                break;

			            case 8:
			                a8--;
			                break;
			            case 9:
			                a9--;
			                break;
					  }
				}
			
			}
			System.out.print(a1);
			System.out.print(a2);
			System.out.print(a3);
			System.out.print(a4);
			System.out.print(a5);
			System.out.print(a6);
			System.out.print(a7);
			System.out.print(a8);
			System.out.println(a9);
			for(j=0;j<27;j++)
			{
				i = 0;
				for(i=0;i<3;i++)
				{
					System.out.print(soduku[j][i]+" ");
				
				}
				i = 0;
				j++;
				for(i=0;i<3;i++)
				{
					System.out.print(soduku[j][i]+" ");
				
				}
				i = 0;
				j++;
				for(i=0;i<3;i++)
				{
					System.out.print(soduku[j][i]+" ");
				
				}
				System.out.println(" ");
			}
		
			int k;
			int l;
			//loops to delete 
			for(j=0;j<27;j++)
			{
				for(i=0;i<3;i++)
				{
					for(k=0;k<solh.length;k++)
					{
						for(l=0;l<9;l++)
						{
							if(j*10+i==solh[k][l])
							{
								if(soduku[j][i]!=0)
								{ 
									int p;
									for(p=0;p<array[k].length;p++)
									{
										if(array[k][p]==soduku[j][i])
										{
											//delete array value
											array[k].remove(p);
										}
									}
								}
									if(array[k].length==1)
									{
										//delete array value
										soduku[j].remove(i);
										soduku[j].insert(array[k][0],i);
										array.remove(k);
										solh.remove (k);			
									}
						
							}
						}
					}
				}
			}
	}
	}
