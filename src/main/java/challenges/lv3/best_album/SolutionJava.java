package challenges.lv3.best_album;

import java.util.*;

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/42579
 *
 *
 *
 * */
class SolutionJava {
    static class Song {
        String genre;
        int index;
        int play;

        public Song(String genre, int index, int play) {
            this.genre = genre;
            this.index = index;
            this.play = play;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        //
        Map<String, Integer> genre = new HashMap<>();
        for (int index = 0 ; index < genres.length ; index++) {
            genre.put(genres[index], genre.getOrDefault(genres[index], 0) + plays[index]);
        }

        ArrayList<String> genreOrderByPlays = new ArrayList<>(genre.keySet());
        genreOrderByPlays.sort((o1, o2) -> genre.get(o2) - genre.get(o1));

        //
        ArrayList<Integer> song = new ArrayList<>();
        for (String g: genreOrderByPlays) {
            ArrayList<Song> s = new ArrayList<>();
            for (int index = 0 ; index < genres.length ; index++) {
                if (genres[index].equals(g)) {
                    s.add(new Song(g, index, plays[index]));
                }
            }

            s.sort((o1 ,o2) -> {
                int diff = o2.play - o1.play;
                if (diff == 0) {
                    return o1.index - o2.index;
                } else {
                    return diff;
                }
            } );

            if (s.size() >= 1) {
                song.add(s.get(0).index);
            }
            if (s.size() >= 2) {
                song.add(s.get(1).index);
            }
        }

        // answer
        int[] answer = new int[song.size()];
        for (int index = 0 ; index < song.size() ; index++) {
            answer[index] = song.get(index);
        }
        return answer;
    }
}