package org.ahmeteminsaglik.utility;

import org.ahmeteminsaglik.API.abstracts.DBWordAPIService;
import org.ahmeteminsaglik.API.concretes.DatabaseConnectionSN;
import org.ahmeteminsaglik.entities.db.Word;
import org.ahmeteminsaglik.enums.EnumWordTable;

import java.util.List;

public class RetriveDataFromDBUtility {

    public synchronized static List<String> getWordListFromDatabaseInStringFormat(EnumWordTable wordTablePool) {
        List<Word> wordList = getWordListFromDB(wordTablePool);
        List<String> stringWordList = convertListGenericFromWordToString(wordList);
        return stringWordList;
    }

    private static List<Word> getWordListFromDB(EnumWordTable wordTablePool) {

        DBWordAPIService wordAPIService = new DatabaseConnectionSN();
        return wordAPIService.getWords(wordTablePool);
    }

    private static List<String> convertListGenericFromWordToString(List<Word> wordObjectPoolList) {
        return ObjectConversion.convertWordListToStringList(wordObjectPoolList);
    }
}
