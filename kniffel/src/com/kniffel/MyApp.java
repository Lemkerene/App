package com.kniffel;

import android.app.Application;

public class MyApp extends Application {

	private static int Spielernummer;
	private static String Spielername;
	private static int[] Zahlen = new int[6];
	private static int[] Blatteintrag = new int[13];
	private static boolean[] bBlatteintrag = new boolean[13];
	
	
	
	/*
	 *Blatteintrag[0] = einer
	 *Blatteintrag[1] = zweier 
	 * Blatteintrag[2] = dreier
	 * Blatteintrag[3] = vierer
	 * Blatteintrag[4] = fuenfer
	 * Blatteintrag[5] = sechser
	 * 
	 * Blatteintrag[6] = dreierpasch
	 * Blatteintrag[7] = viererpasch
	 * Blatteintrag[8] = fullhouse
	 * Blatteintrag[9] = kl strasse
	 * Blatteintrag[10] = gr Strasse
	 * Blatteintrag[11] = kniffel
	 * Blatteintrag[12] = chance
	 */
	public void Init() {
		
		for(int i =0;i<6;i++)
		{
			Zahlen[i] =0;
		}
		for(int i =0;i<13;i++)
		{
			Blatteintrag[i] = 0;
			bBlatteintrag[i] = false;
		}
	}
	
	

	public void setSpielernummer(int w)
	{
		Spielernummer = w;
	}
	
	public void setZahlen(int[] w)
	{
		Zahlen = w;
	}
	public int[] GetZahlen()
	{
		return Zahlen;
	}
	
	public void setButtonEintrag(int w)
	{
		for(int i=0;i<13;i++)
		{
			if(i == w-1)
			{
				bBlatteintrag[i] = true;
				break;
			}
		}
	}
	
	public void setButtonEintrag(int w, int z)
	{
		for(int i=0;i<13;i++)
		{
			if(i == w-1)
			{
				Blatteintrag[i] = z;
				bBlatteintrag[i] = true;
				break;
			}
		}
	}
	public int[] GetBlatteintrage()
	{
		return Blatteintrag;
	}
	
	public boolean[] GetButtonEintrage()
	{
		return bBlatteintrag;
	}

	public int getSpielernummer()
	{
	  return Spielernummer;
	}
	
	public void setSpielername(String w)
	{
		Spielername = w;
	}

	public String getSpielername()
	{
	  return Spielername;
	}

}