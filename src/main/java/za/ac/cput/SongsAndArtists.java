package za.ac.cput;

/*
   Name: Damian Du Toit
   Student Number: 219200203
   Year: 3
   Subject: App Dev 3
   IDE: IntelliJ
   Project Type: Apache Maven
 */

//This class will list 5 of my favourite songs as well as the artists and the release dates
public class SongsAndArtists
{
    String song1, song2, song3, song4, song5, artist1, artist2, artist3, artist4, artist5;
    int releaseDate1, releaseDate2, releaseDate3, releaseDate4, releaseDate5;

    public SongsAndArtists()
    {
        this.song1 = "Fading Memories";
        this.song2 = "Lust of the Lost";
        this.song3 = "Losing my Mind";
        this.song4 = "Cleaning out my Closet";
        this.song5 = "A Prophecy";
        this.artist1 = "Famous Last Words";
        this.artist2 = "Famous Last Words";
        this.artist3 = "Falling in Reverse";
        this.artist4 = "Eminem";
        this.artist5 = "Asking Alexandria";
        this.releaseDate1 = 2014;
        this.releaseDate2 = 2013;
        this.releaseDate3 = 2018;
        this.releaseDate4 = 2002;
        this.releaseDate5 = 2009;
    }

    //Getters
    public String getSong1()
    {
        return song1;
    }
    public String getSong2()
    {
        return song2;
    }
    public String getSong3()
    {
        return song3;
    }
    public String getSong4()
    {
        return song4;
    }
    public String getSong5()
    {
        return song5;
    }
    public String getArtist1()
    {
        return artist1;
    }
    public String getArtist2()
    {
        return artist2;
    }
    public String getArtist3()
    {
        return artist3;
    }
    public String getArtist4()
    {
        return artist4;
    }
    public String getArtist5()
    {
        return artist5;
    }
    public int getReleaseDate1()
    {
        return releaseDate1;
    }
    public int getReleaseDate2()
    {
        return releaseDate2;
    }
    public int getReleaseDate3()
    {
        return releaseDate3;
    }
    public int getReleaseDate4()
    {
        return releaseDate4;
    }
    public int getReleaseDate5()
    {
        return releaseDate5;
    }

    //Setters
    public void setSong1()
    {
        this.song1 = song1;
    }
    public void setSong2()
    {
        this.song2 = song2;
    }
    public void setSong3()
    {
        this.song3 = song3;
    }
    public void setSong4()
    {
        this.song4 = song4;
    }
    public void setSong5()
    {
        this.song5 = song5;
    }
    public void setArtist1()
    {
        this.artist1 = artist1;
    }
    public void setArtist2()
    {
        this.artist2 = artist2;
    }
    public void setArtist3()
    {
        this.artist3 = artist3;
    }
    public void setArtist4()
    {
        this.artist4 = artist4;
    }
    public void setArtist5()
    {
        this.artist5 = artist5;
    }

    //toString()
    @Override
    public String toString()
    {
        return "SongsAndArtists: " +
                "Song 1: " + song1 + "Artist: " + artist1 + "Release Date: " + releaseDate1 +
                "Song 2: " + song2 + "Artist: " + artist2 + "Release Date: " + releaseDate2 +
                "Song 3: " + song3 + "Artist: " + artist3 + "Release Date: " + releaseDate3 +
                "Song 4: " + song4 + "Artist: " + artist4 + "Release Date: " + releaseDate4 +
                "Song 5: " + song5 + "Artist: " + artist5 + "Release Date: " + releaseDate5;
    }
}
