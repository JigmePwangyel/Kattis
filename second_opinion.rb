seconds = gets.to_i

hours = seconds / 3600
seconds %= 3600
minutes = seconds / 60
seconds %= 60

puts "#{hours} : #{minutes} : #{seconds}"
