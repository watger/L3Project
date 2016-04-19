/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pardojeremie
 */
public class Dictionary {
    private ArrayList<String> ListWords;
    
    public Dictionary() throws IOException {
        ListWords = new ArrayList<String>();
        setListWords();
    }   

    public ArrayList<String> getListWords() {
        return ListWords;
    }

    public void setListWords() throws IOException  {
        String ligne = "";
		String fichier = "";
		BufferedReader ficTexte;
		try {
			ficTexte = new BufferedReader(new FileReader(new File("build/classes/ods5.txt")));
			if (ficTexte == null) {
				throw new FileNotFoundException("Fichier non trouvé: "
						+ fichier);
			}
                        else
			do {
				ligne = ficTexte.readLine();
				ListWords.add(ligne);
			} while (ligne != null);
			ficTexte.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
    }
    
    public boolean ContainWords(String str) {
        if(ListWords.contains(str))
            return true;
        return false;
    }
}
