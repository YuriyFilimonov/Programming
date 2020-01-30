package Ets;

import java.util.ArrayList;
import java.util.List;

public class HotKey {
    public static List<String[]> hotKey = new ArrayList<>();
    public static void main(String[] args) {
    
        hotKey.add(new String[]{"git status", "Показывает статус состояния файлов", ""});
        hotKey.add(new String[]{"git add", "Индексирование текущих изменений файлов.\n Неотслеживаемые файлы" +
                " преобразует в отслеживаемые, в отслеживаемых индексирует изменения", "git add README"});
        hotKey.add(new String[]{"git init", "Инициализирует локальный репозиторий. Команда выполняется" +
                " из каталога проекта", ""});
        hotKey.add(new String[]{"git status -s, git status -short", "Показывает короткий вариант статуса состояния " +
                "файлов", ""});
        hotKey.add(new String[]{"git diff", "Показывает подробные изменения в измененных, но не " +
                "проиндексированных файлах", ""});
        hotKey.add(new String[]{"git diff --staged, git diff --cached", "Сравнивает состояние индексированных " +
                "файлов по отношению к последнему commit", ""});
        hotKey.add(new String[]{"git commit", "Фиксирует изменения в индексированных файлах. Для добавления " +
                "комментариев открывает редактор, установленный в config  по умолчанию", ""});
        hotKey.add(new String[]{"git commit -m", "Фиксирует изменения в индексированных файлах. После ключевого" +
                "слова -m вносятся комментарии.", "git commit -m \"Story 182: Fix benchmarks for speed\""});
        hotKey.add(new String[]{"git commit -a", "Индексирование текущих изменений файлов и создает commit.", ""});
        hotKey.add(new String[]{"git rm", "Удаляет измененный непроиндексированный файл из отслеживаемых.",
                "rm PROJECTS.md\ngit rm PROJECTS.md"});
        hotKey.add(new String[]{"git rm --cached", "Удаляет файл из отслеживаемых, но оставляет его в рабочем " +
                "каталоге без отслеживания", "git rm --cached README, git rm log/\\*.log"});
        hotKey.add(new String[]{"git mv file_from file_to", "Переименовывает файл", ""});
    }
}
