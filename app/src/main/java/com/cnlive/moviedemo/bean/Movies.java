package com.cnlive.moviedemo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WJY on 2015/9/26.
 */
public class Movies {


	/**
	 * page : 1
	 * results : [{"adult":false,"backdrop_path":"/tbhdm8UJAb4ViCTsulYFL3lxMCd.jpg","genre_ids":[53,28,12],"id":76341,"original_language":"en","original_title":"Mad Max: Fury Road","overview":"An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order. There's Max, a man of action and a man of few words, who seeks peace of mind following the loss of his wife and child in the aftermath of the chaos. And Furiosa, a woman of action and a woman who believes her path to survival may be achieved if she can make it across the desert back to her childhood homeland.","release_date":"2015-05-15","poster_path":"/kqjL17yufvn9OVLyXYpvtyrFfak.jpg","popularity":39.718239,"title":"Mad Max: Fury Road","video":false,"vote_average":7.6,"vote_count":2344},{"adult":false,"backdrop_path":"/rFtsE7Lhlc2jRWF7SRAU0fvrveQ.jpg","genre_ids":[878,28,12],"id":99861,"original_language":"en","original_title":"Avengers: Age of Ultron","overview":"When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth\u2019s Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure.","release_date":"2015-05-01","poster_path":"/t90Y3G8UGQp0f0DrP60wRu9gfrH.jpg","popularity":24.66705,"title":"Avengers: Age of Ultron","video":false,"vote_average":7.6,"vote_count":2295},{"adult":false,"backdrop_path":"/3Kgu3ys6W6UZWWFty7rlTWgST63.jpg","genre_ids":[28,12,878],"id":166424,"original_language":"en","original_title":"Fantastic Four","overview":"Four young outsiders teleport to a dangerous universe, which alters their physical form in shocking ways. Their lives irrevocably upended, the team must learn to harness their daunting new abilities and work together to save Earth from a former friend turned enemy. [20th Century Fox]","release_date":"2015-08-07","poster_path":"/g23cs30dCMiG4ldaoVNP1ucjs6.jpg","popularity":23.675025,"title":"Fantastic Four","video":false,"vote_average":4.7,"vote_count":490},{"adult":false,"backdrop_path":"/t5KONotASgVKq4N19RyhIthWOPG.jpg","genre_ids":[28,12,878,53],"id":135397,"original_language":"en","original_title":"Jurassic World","overview":"Twenty-two years after the events of Jurassic Park, Isla Nublar now features a fully functioning dinosaur theme park, Jurassic World, as originally envisioned by John Hammond.","release_date":"2015-06-12","poster_path":"/uXZYawqUsChGSj54wcuBtEdUJbh.jpg","popularity":21.286206,"title":"Jurassic World","video":false,"vote_average":7,"vote_count":2312},{"adult":false,"backdrop_path":"/bAfIhDOte1QKp6BpisfPPEcrROh.jpg","genre_ids":[53,28,878],"id":294254,"original_language":"en","original_title":"Maze Runner: The Scorch Trials","overview":"Thomas and his fellow Gladers face their greatest challenge yet: searching for clues about the mysterious and powerful organization known as WCKD. Their journey takes them to the Scorch, a desolate landscape filled with unimaginable obstacles. Teaming up with resistance fighters, the Gladers take on WCKD\u2019s vastly superior forces and uncover its shocking plans for them all.","release_date":"2015-09-18","poster_path":"/vlTPQANjLYTebzFJM1G4KeON0cb.jpg","popularity":21.561653,"title":"Maze Runner: The Scorch Trials","video":false,"vote_average":6.8,"vote_count":159},{"adult":false,"backdrop_path":"/kJre98tnbNXbk5L5altHkQWGwD3.jpg","genre_ids":[28,12,9648,878,10751],"id":158852,"original_language":"en","original_title":"Tomorrowland","overview":"Bound by a shared destiny, a bright, optimistic teen bursting with scientific curiosity and a former boy-genius inventor jaded by disillusionment embark on a danger-filled mission to unearth the secrets of an enigmatic place somewhere in time and space that exists in their collective memory as \"Tomorrowland.\"","release_date":"2015-05-22","poster_path":"/b0f5Thd0IVYVUcteQAtcnwdta0c.jpg","popularity":20.491272,"title":"Tomorrowland","video":false,"vote_average":6.4,"vote_count":543},{"adult":false,"backdrop_path":"/sLbXneTErDvS3HIjqRWQJPiZ4Ci.jpg","genre_ids":[10751,16,12,35],"id":211672,"original_language":"en","original_title":"Minions","overview":"Minions Stuart, Kevin and Bob are recruited by Scarlet Overkill, a super-villain who, alongside her inventor husband Herb, hatches a plot to take over the world.","release_date":"2015-06-25","poster_path":"/q0R4crx2SehcEEQEkYObktdeFy.jpg","popularity":17.663034,"title":"Minions","video":false,"vote_average":6.9,"vote_count":1374},{"adult":false,"backdrop_path":"/2BXd0t9JdVqCp9sKf6kzMkr7QjB.jpg","genre_ids":[12,10751,16,28,35],"id":177572,"original_language":"en","original_title":"Big Hero 6","overview":"The special bond that develops between plus-sized inflatable robot Baymax, and prodigy Hiro Hamada, who team up with a group of friends to form a band of high-tech heroes.","release_date":"2014-11-07","poster_path":"/3zQvuSAUdC3mrx9vnSEpkFX0968.jpg","popularity":15.526365,"title":"Big Hero 6","video":false,"vote_average":7.9,"vote_count":2354},{"adult":false,"backdrop_path":"/bIlYH4l2AyYvEysmS2AOfjO7Dn8.jpg","genre_ids":[878,28,53,12],"id":87101,"original_language":"en","original_title":"Terminator Genisys","overview":"The year is 2029. John Connor, leader of the resistance continues the war against the machines. At the Los Angeles offensive, John's fears of the unknown future begin to emerge when TECOM spies reveal a new plot by SkyNet that will attack him from both fronts; past and future, and will ultimately change warfare forever.","release_date":"2015-07-01","poster_path":"/5JU9ytZJyR3zmClGmVm9q4Geqbd.jpg","popularity":15.20127,"title":"Terminator Genisys","video":false,"vote_average":6.3,"vote_count":981},{"adult":false,"backdrop_path":"/ioEozbN5RJouaIWTSe8zNHkC1yY.jpg","genre_ids":[28,18,53],"id":254128,"original_language":"en","original_title":"San Andreas","overview":"In the aftermath of a massive earthquake in California, a rescue-chopper pilot makes a dangerous journey across the state in order to rescue his estranged daughter.","release_date":"2015-05-29","poster_path":"/6iQ4CMtYorKFfAmXEpAQZMnA0Qe.jpg","popularity":15.19088,"title":"San Andreas","video":false,"vote_average":6.4,"vote_count":824},{"adult":false,"backdrop_path":"/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg","genre_ids":[18,878],"id":157336,"original_language":"en","original_title":"Interstellar","overview":"Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.","release_date":"2014-11-05","poster_path":"/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg","popularity":14.60842,"title":"Interstellar","video":false,"vote_average":8.3,"vote_count":3320},{"adult":false,"backdrop_path":"/szytSpLAyBh3ULei3x663mAv5ZT.jpg","genre_ids":[35,16,10751],"id":150540,"original_language":"en","original_title":"Inside Out","overview":"Growing up can be a bumpy road, and it's no exception for Riley, who is uprooted from her Midwest life when her father starts a new job in San Francisco. Like all of us, Riley is guided by her emotions - Joy, Fear, Anger, Disgust and Sadness. The emotions live in Headquarters, the control center inside Riley's mind, where they help advise her through everyday life. As Riley and her emotions struggle to adjust to a new life in San Francisco, turmoil ensues in Headquarters. Although Joy, Riley's main and most important emotion, tries to keep things positive, the emotions conflict on how best to navigate a new city, house and school.","release_date":"2015-06-19","poster_path":"/aAmfIX3TT40zUHGcCKrlOZRKC7u.jpg","popularity":14.51268,"title":"Inside Out","video":false,"vote_average":8.2,"vote_count":1123},{"adult":false,"backdrop_path":"/L5QRL1O3fGs2hH1LbtYyVl8Tce.jpg","genre_ids":[53,28,878,10749],"id":262500,"original_language":"en","original_title":"Insurgent","overview":"Beatrice Prior must confront her inner demons and continue her fight against a powerful alliance which threatens to tear her society apart.","release_date":"2015-03-20","poster_path":"/aBBQSC8ZECGn6Wh92gKDOakSC8p.jpg","popularity":13.541387,"title":"Insurgent","video":false,"vote_average":6.8,"vote_count":1137},{"adult":false,"backdrop_path":"/uHeMMJIZRVjeS2WIFcxBCdCTdmk.jpg","genre_ids":[28,12,53],"id":177677,"original_language":"en","original_title":"Mission: Impossible \u2013 Rogue Nation","overview":"Ethan and team take on their most impossible mission yet, eradicating the Syndicate - an International rogue organization as highly skilled as they are, committed to destroying the IMF.","release_date":"2015-07-31","poster_path":"/bkfhyuyzYoy8xkkt7vtBTUrZ5Ha.jpg","popularity":12.081201,"title":"Mission: Impossible \u2013 Rogue Nation","video":false,"vote_average":7.2,"vote_count":881},{"adult":false,"backdrop_path":"/kvXLZqY0Ngl1XSw7EaMQO0C1CCj.jpg","genre_ids":[28,12,878],"id":102899,"original_language":"en","original_title":"Ant-Man","overview":"Armed with the astonishing ability to shrink in scale but increase in strength, con-man Scott Lang must embrace his inner-hero and help his mentor, Dr. Hank Pym, protect the secret behind his spectacular Ant-Man suit from a new generation of towering threats. Against seemingly insurmountable obstacles, Pym and Lang must plan and pull off a heist that will save the world.","release_date":"2015-07-17","poster_path":"/7SGGUiTE6oc2fh9MjIk5M00dsQd.jpg","popularity":12.694555,"title":"Ant-Man","video":false,"vote_average":7,"vote_count":1250},{"adult":false,"backdrop_path":"/AoYGqtWxcNmQjQIpRCMtzpFfL1T.jpg","genre_ids":[28,35,80],"id":238713,"original_language":"en","original_title":"Spy","overview":"A desk-bound CIA analyst volunteers to go undercover to infiltrate the world of a deadly arms dealer, and prevent diabolical global disaster.","release_date":"2015-06-05","poster_path":"/gCBw0AQDhlo0bNetkjsSRWzrxpW.jpg","popularity":11.514998,"title":"Spy","video":false,"vote_average":7.2,"vote_count":720},{"adult":false,"backdrop_path":"/qhH3GyIfAnGv1pjdV3mw03qAilg.jpg","genre_ids":[12,14],"id":122917,"original_language":"en","original_title":"The Hobbit: The Battle of the Five Armies","overview":"Mere seconds after the events of \"Desolation\", Bilbo and Company continue to claim a mountain of treasure that was guarded long ago: But with Gandalf the Grey also facing some formidable foes of his own, the Hobbit is outmatched when the brutal army of orcs led by Azog the Defiler returns. But with other armies such as the elves and the men of Lake-Town, which are unsure to be trusted, are put to the ultimate test when Smaug's wrath, Azog's sheer strength, and Sauron's force of complete ends attack. All in all, the trusted armies have two choices: unite or die. But even worse, Bilbo gets put on a knife edge and finds himself fighting with Hobbit warfare with all of his might for his dwarf-friends, as the hope for Middle-Earth is all put in Bilbo's hands. The one \"precious\" thing to end it all.","release_date":"2014-12-17","poster_path":"/ehObfVePRIGEfHaYKLG0fgMJoCB.jpg","popularity":12.506443,"title":"The Hobbit: The Battle of the Five Armies","video":false,"vote_average":7.3,"vote_count":1924},{"adult":false,"backdrop_path":"/aUYcExsGuRaw7PLGmAmXubt1dfG.jpg","genre_ids":[18,14,10749,10751],"id":150689,"original_language":"en","original_title":"Cinderella","overview":"When her father unexpectedly passes away, young Ella finds herself at the mercy of her cruel stepmother and her daughters. Never one to give up hope, Ella's fortunes begin to change after meeting a dashing stranger in the woods.","release_date":"2015-03-13","poster_path":"/2i0JH5WqYFqki7WDhUW56Sg0obh.jpg","popularity":11.162198,"title":"Cinderella","video":false,"vote_average":7,"vote_count":690},{"adult":false,"backdrop_path":"/nkwoiSVJLeK0NI8kTqioBna61bm.jpg","genre_ids":[35],"id":214756,"original_language":"en","original_title":"Ted 2","overview":"Newlywed couple Ted and Tami-Lynn want to have a baby, but in order to qualify to be a parent, Ted will have to prove he's a person in a court of law.","release_date":"2015-06-26","poster_path":"/A7HtCxFe7Ms8H7e7o2zawppbuDT.jpg","popularity":12.127984,"title":"Ted 2","video":false,"vote_average":6.9,"vote_count":699},{"adult":false,"backdrop_path":"/nvZVu6inpwLHKqRXZhye3S4uqei.jpg","genre_ids":[28,35,878],"id":257344,"original_language":"en","original_title":"Pixels","overview":"Video game experts are recruited by the military to fight 1980s-era video game characters who've attacked New York.","release_date":"2015-07-24","poster_path":"/ktyVmIqfoaJ8w0gDSZyjhhOPpD6.jpg","popularity":12.127661,"title":"Pixels","video":false,"vote_average":6.3,"vote_count":381}]
	 * total_pages : 12231
	 * total_results : 244620
	 */

	public int page;
	public int total_pages;
	public int total_results;
	public List<ResultsEntity> results;

	public static class ResultsEntity implements Serializable {
		/**
		 * adult : false
		 * backdrop_path : /tbhdm8UJAb4ViCTsulYFL3lxMCd.jpg
		 * genre_ids : [53,28,12]
		 * id : 76341
		 * original_language : en
		 * original_title : Mad Max: Fury Road
		 * overview : An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order. There's Max, a man of action and a man of few words, who seeks peace of mind following the loss of his wife and child in the aftermath of the chaos. And Furiosa, a woman of action and a woman who believes her path to survival may be achieved if she can make it across the desert back to her childhood homeland.
		 * release_date : 2015-05-15
		 * poster_path : /kqjL17yufvn9OVLyXYpvtyrFfak.jpg
		 * popularity : 39.718239
		 * title : Mad Max: Fury Road
		 * video : false
		 * vote_average : 7.6
		 * vote_count : 2344
		 */

		public boolean adult;
		public String backdrop_path;
		public int id;
		public String original_language;
		public String original_title;
		public String overview;
		public String release_date;
		public String poster_path;
		public double popularity;
		public String title;
		public boolean video;
		public String vote_average;
		public String vote_count;
		public List<Integer> genre_ids;
	}
}
